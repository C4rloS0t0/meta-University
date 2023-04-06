SUMMARY = "Minimal Hello world!"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://serviceappcpp.cpp"

S = "${WORKDIR}"

do_compile () {
    ${CXX} ${CFLAGS} -c -o serviceappcpp.o serviceappcpp.cpp
    ${CXX} ${LDFLAGS} -o serviceappcpp-cpp serviceappcpp.o
}

do_install () {
    install -d ${D}${bindir}
    install -m 0755 serviceappcpp-cpp ${D}${bindir}/
}