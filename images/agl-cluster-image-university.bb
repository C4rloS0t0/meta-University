# We base this recipe on agl-cluster-demo-platform demo 
require ../../meta-agl/meta-agl-core/recipes-platform/images/agl-image-minimal.bb

# Adding a description is optional but often helps the user understand the purpose of the image
DESCRIPTION = "Build Test base on agl-cluster-demo-platform.bb"

# Additional recipes to be added to the build
IMAGE_INSTALL += "serviceapp"
IMAGE_INSTALL += "serviceappcpp"
IMAGE_INSTALL += "testservices"
IMAGE_INSTALL += "testservicescpp"