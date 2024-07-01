# How to contribute

We would like to start with saying thank you for wanting to contribute to COMET-SDKJ codebase. We want to keep it as easy as possible to contribute changes that get things working in your environment. There are a few guidelines that we need contributors to follow so that we have a chance of keeping on top of things.

- [Making Changes](#making-changes)
  - [Handling Updates from Upstream/Development](#handling-updates-from-upstreamdevelopment)
  - [Sending a Pull Request](#sending-a-pull-request)
- [Style Guidelines](#style-guidelines)

## Making Changes

1. [Fork](http://help.github.com/forking/) on GitHub
1. Clone your fork locally
1. Configure the upstream repo (`git remote add upstream git://github.com/STARIONGROUP/COMET-SDKJ-Community-Edition`) 
1. Checkout development
1. Create a local branch (`git checkout -b myBranch`) from development
1. Work on your feature
1. Rebase if required (see below)
1. Push the branch up to GitHub (`git push origin myBranch`)
1. Send a Pull Request on GitHub

You should **never** work on a clone of master or development, and you should **never** send a pull request from master or development - always from a branch. The reasons for this are detailed below.

### Handling Updates from Upstream/Development

While you're working away in your branch it's quite possible that your upstream development (most likely the canonical COMET-SDKJ version) may be updated. If this happens you should:

1. [Stash](http://git-scm.com/book/en/Git-Tools-Stashing) any un-committed changes you need to
1. `git checkout development`
1. `git pull upstream development`
1. `git checkout myBranch`
1. `git rebase development myBranch`
1. `git push origin development` - (optional) this makes sure your remote development is up to date

This ensures that your history is "clean" i.e. you have one branch off from development followed by your changes in a straight line. Failing to do this ends up with several "messy" merges in your history, which we don't want. This is the reason why you should always work in a branch and you should never be working in, or sending pull requests from, development.

If you're working on a long running feature then you may want to do this quite often, rather than run the risk of potential merge issues further down the line.

### Sending a Pull Request

While working on your feature you may well create several branches, which is fine, but before you send a pull request you should ensure that you have rebased back to a single "Feature branch". We care about your commits, and we care about your feature branch; but we don't care about how many or which branches you created while you were working on it :smile:.

When you're ready to go you should confirm that you are up to date and rebased with upstream/development (see "Handling Updates from Upstream/development" above), and then:

1. `git push origin myBranch`
1. Send a descriptive [Pull Request](https://help.github.com/articles/creating-a-pull-request/) on GitHub - making sure you have selected the correct branch in the GitHub UI!
1. Wait for @samatrhea to merge your changes in.

And remember; **A pull-request with tests is a pull-request that's likely to be pulled in.** :grin: Bonus points if you document your feature in our [wiki](https://github.com/STARIONGROUP/COMET-SDKJ-Community-Edition/wiki) once it has been pulled in

## Style Guidelines

It is strongly encouraged to follow [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
Code style is checked with a maven plugin during validate phase and might trigger build error if some rules are not followed.

To get some help from your favourite IDE in following the code style please clone [google style guide](https://github.com/google/styleguide) repository to your computer.
Import an appropriate file from the project that you just cloned to your IDE.

#### IntelliJ IDEA

Open up the File -> Settings and navigate to Editor -> Code Style -> Java and press on the cogwheel and select Import Scheme -> IntelliJ IDEA code style XML and import the file intellij-java-google-style.xml.

#### Eclipse

Open up the preferences and navigate to Java -> Code Style -> Formatter and press on Import and select the file eclipse-java-google-style.xml.

Now it will be much easier to follow code style and you always can see the result of code style check in your console.