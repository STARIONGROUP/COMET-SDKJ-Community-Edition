<img src="https://github.com/STARIONGROUP/COMET-SDKJ-Community-Edition/raw/master/COMET.jpg" width="250">

> COMET is the new name for what was previously called the CDP4. We are transitioning the applications and software libraries. The code and documentation will still refer to CDP4 in a number of places while we are updating.

# COMET-SDKJ-Community-Edition

The COMET Java Software Development Kit that is compliant with ECSS-E-TM-10-25 Annex A and Annex C. The COMET-SDKJ-Community-Edition is a line by line port of the [C# COMET-SDK-Community-Editio](https://github.com/STARIONGROUP/COMET-SDK-Community-Edition). The COMET-SDKJ tries to stay very close to the C# COMET-SDK to make sure the API's are very similar, differences may occur due to languate specific features.

> The C# SDK is the primary implementation, therefore the Java implementation may be a bit behind on new features and bug fixes. Both libraries are actively maintained and the Java implementation will get sycned up within a few weeks.

# Maven Central

The SDK contains multiple libraries that are each packaged as Maven artifacts and avaialble from [Maven Central](https://mvnrepository.com/).

Artifact | Link
---------|-----
CDP4Common | [![Maven Central](https://img.shields.io/maven-central/v/eu.stariongroup/cdp4common?style=plastic)](https://mvnrepository.com/artifact/eu.stariongroup/cdp4common)
CDP4JsonSerializer | [![Maven Central](https://img.shields.io/maven-central/v/eu.stariongroup/cdp4jsonserializer?style=plastic)](https://mvnrepository.com/artifact/eu.stariongroup/cdp4jsonserializer)
CDP4Dal | [![Maven Central](https://img.shields.io/maven-central/v/eu.stariongroup/cdp4dal?style=plastic)](https://mvnrepository.com/artifact/eu.stariongroup/cdp4dal)
CDP4JsonFileDal | [![Maven Central](https://img.shields.io/maven-central/v/eu.stariongroup/cdp4jsonfiledal?style=plastic)](https://mvnrepository.com/artifact/eu.stariongroup/cdp4jsonfiledal)
CDP4ServicesDal | [![Maven Central](https://img.shields.io/maven-central/v/eu.stariongroup/cdp4servicesdal?style=plastic)](https://mvnrepository.com/artifact/eu.stariongroup/cdp4servicesdal)
CDP4WspDal | [![Maven Central](https://img.shields.io/maven-central/v/eu.stariongroup/cdp4wspdal?style=plastic)](https://mvnrepository.com/artifact/eu.stariongroup/cdp4wspdal)

# Build and Coverage Status

Travis is used to build and test the COMET-SDKJ

| Branch | Status | Coverage |
|--------|--------|----------|
| Master | [![Build Status](https://travis-ci.com/STARIONGROUP/CDP4-SDKJ-Community-Edition.svg?branch=master)](https://travis-ci.com/STARIONGROUP/CDP4-SDKJ-Community-Edition) | [![codecov](https://codecov.io/gh/STARIONGROUP/CDP4-SDKJ-Community-Edition/branch/master/graph/badge.svg)](https://codecov.io/gh/STARIONGROUP/CDP4-SDKJ-Community-Edition) |
| Development | [![Build Status](https://travis-ci.com/STARIONGROUP/CDP4-SDKJ-Community-Edition.svg?branch=development)](https://travis-ci.com/STARIONGROUP/CDP4-SDKJ-Community-Edition) | [![codecov](https://codecov.io/gh/STARIONGROUP/CDP4-SDKJ-Community-Edition/branch/development/graph/badge.svg)](https://codecov.io/gh/STARIONGROUP/CDP4-SDKJ-Community-Edition) |

## CDP4Common

The CDP4Common library is a Java implementation of the COMET UML master model. The COMET UML master model is based on the ECSS-E-TM-10-25A Annex A UML master model and extends it with COMET concepts to improve the use of ECSS-E-TM-10-25A Annex A for Concurrent Design of complex systems. The library contains both POJO and DTO implementations of the classes defined in the COMET UML master model. The POJO classes are used when a full object graph is required. The DTO's are used when a full object graph is not required, references to other class are represented by unique identifiers in the form of a GUID.

The CDP4Common library also includes a set of so-called MetaInfo classes. These classes are used to provide information about the classes in the UML master model such as the properties, relationships to other classes etc. These classes provide similar functionality as the Java reflection system, but with higher performance.

## CDP4JsonSerializer

The CDP4JsonSerializer library is an optimized CDP4Common specific JSON (de)serialization library that is used to serialize and deserialize the classes implemented in the CDP4Common class library.

## CDP4Dal

The CDP4Dal library is a library that provides the basis to implement ECSS-E-TM-10-25A Annex C. Annex C specifies both the JSON REST API and the exchange file format. The CDP4Dal library contains the Assembler that is used to create a fully dereferenced object graph, a message bus to send cdp4dal.events for consumptions in applications that implement the MVVM design pattern as well as the cdp4dal.Session class that manages a connection to a datasource.

## CDP4EmfModel

The CDP4EmfModel library is a Ecore implementation of the ECSS-E-TM-10-25A Annex A UML master model. The library contains interfaces and implementations of the classes defined in the CDP4 UML master model.

## CDP4EmfConnector

The CDP4EmfConnector library is a middle layer that enables to use Ecore implementation of the ECSS-E-TM-10-25A Annex A UML master model for COMET Concurrent Design of complex systems. The library contains method that can be use to convert Ecore implementation of the ECSS-E-TM-10-25A Annex A UML master model to CDP4 POJO classes defined in the COMET UML master model.

## CDP4JsonFileDal

The CDP4JsonFileDal library is a Java library that provides an implementation of ECSS-E-TM-10-25A Annex C.3, the JSON Exchange File Format. This file format is a ZIP archive in which a number of files are stored that each contain one or more ECSS-E-TM-10-25 objects that are serialized in the form of a JSON array of JSON objects. The CDP4JsonFileDal library can be used to read from such a ZIP archive, and to create such a ZIP archive. The ZIP archive is typically used to exchange complete models between organizations.

## CDP4ServicesDal

The CDP4ServicesDal library is a Java library that provides an implementation of ECSS-E-TM-10-25A Annex C.2, the JSON REST API, which includes concepts that are specific to the COMET. These COMET specific items are pure extensions of ECSS-E-TM-10-25A. The CDP4ServicesDal library can only be used to communicate with a COMET Services instance, dedicated HTTP headers are used to verify that the REST API is indeed a COMET Services instance.

## CDP4WspDal

The CDP4WspDal library is a Java library that provides an implementation of ECSS-E-TM-10-25A Annex C.2, the JSON REST API. The CDP4WspDal can be used to communicate with any ECSS-E-TM-10-25A Annex C.2 implementation, including the COMET Services.

# License

The libraries contained in the COMET-SDKJ Community Edition are provided to the community under the GNU Lesser General Public License. Because we make the software available with the LGPL, it can be used in both open source and proprietary software without being required to release the source code of your own components.

# Contributions

Contributions to the code-base are welcome. However, before we can accept your contributions we ask any contributor to sign the Contributor License Agreement (CLA) and send this digitaly signed to s.gerene@stariongroup.eu. You can find the CLA's in the CLA folder.