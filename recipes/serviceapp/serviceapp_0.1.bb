SUMMARY = "Simple helloworld application"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/C4rloS0t0/serviceappc.git;protocol=https;branch=master"

PV = "1.0+git${SRCPV}"
SRCREV = "407afe0c2d33cb13ea2bd2a879938723b8f4a287"

S = "${WORKDIR}/git"

do_compile() {
    cd ${S}/src
    ${CC} ${LDFLAGS} serviceapp.c -o serviceapp
}

do_install() {
    cd ${S}/src
    install -d ${D}${bindir}
    install -m 0755 serviceapp ${D}${bindir}
}
