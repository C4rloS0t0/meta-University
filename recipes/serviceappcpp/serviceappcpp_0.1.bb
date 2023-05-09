SUMMARY = "Minimal Hello world!"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/C4rloS0t0/serviceappcpp.git;protocol=https;branch=master"

PV = "1.0+git${SRCPV}"
SRCREV = "a9b61afdd2f1ea8ad6f4fb82d6c82bcc74999010"

S = "${WORKDIR}/git"

do_compile () {
    cd ${S}/src
    ${CXX} ${CFLAGS} -c -o serviceappcpp.o serviceappcpp.cpp -I ${S}/inc
    ${CXX} ${CFLAGS} -c -o serviceappmain.o main_service.cpp -I ${S}/inc
    ${CXX} ${LDFLAGS} -o serviceappcpp-cpp serviceappcpp.o serviceappmain.o
}

do_install () {
    cd ${S}/src
    install -d ${D}${bindir}
    install -m 0755 serviceappcpp-cpp ${D}${bindir}/
}