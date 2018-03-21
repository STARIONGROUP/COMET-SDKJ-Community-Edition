/*
 * OrderedItem.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.types;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
* The ordered item  contains the ordered key and  the value
*/
public class OrderedItem implements Serializable{
    /**
    * Initializes a new instance of the {@link OrderedItem} class.
    */
    public OrderedItem()
    {
        this.m = null;
    }

    /**
    * The key.
    */
    @Getter
    @Setter
    public long k;

    /**
    * The value.
    */
    @Getter
    @Setter
    public Object v;

    /**
    * The move index
    */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    public Long m;

    /**
    * Explicitly protect the {@link #m} property by not allowing it to be set directly.
    * 
    * @param originalIndex The original index position of this {@link OrderedItem}
    * @param newIndex The new index position of this {@link OrderedItem}
     */
    public void moveItem(long originalIndex, long newIndex)
    {
        if (originalIndex == newIndex)
        {
            return;
        }

        this.k = originalIndex;

        this.m = newIndex;
    }

    /**
    * The standard equality operator.
    * 
    * @param obj
    * The {@link Object} to compare to.
    * @return The <{@link boolean} indicating whether the equality holds.
    */
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }

        if (obj == this)
        {
            return true;
        }

        Class vType = this.v.getClass();
        if (vType.isPrimitive())
        {
            return this.primitiveEquals((OrderedItem)obj);
        }

        return obj.getClass().equals(this.getClass()) && this.equals((OrderedItem)obj);
    }

    /**
    * Gets the hash code of this instance
    * 
    * @return The {@link int} indicating the hash code.
    */
    @Override
    public int hashCode()
    {
        return this.v != null ? this.v.hashCode() : 0;
    }

    /**
    * The standard equality operator. The object of type {@link OrderedItem} are considered equal if the values are equal.
    * 
    * @param other The {@link OrderedItem} being compared to this instance.
    * @return The {@link boolean} indicating whether the equality holds.
     */
    protected boolean equals(OrderedItem other)
    {
        return other != null && this.v.equals(other.v);
    }

    /**
    * The primitive equality operator. The object of type {@link OrderedItem} are considered equal if their key/value are equal.
    * 
    * @param other The {@link OrderedItem} being compared to this instance.
    * @return The {@link boolean} indicating whether the equality holds.
     */
    protected boolean primitiveEquals(OrderedItem other)
    {
        return this.k == other.k && this.v.equals(other.v);
    }
}
