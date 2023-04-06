SUMMARY = "Systemd example recipe"
DESCRIPTION = "Systemd service example for test C service"
LICENSE = "CLOSED"

inherit systemd
NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "testc.service"

SRC_URI += "file://testc.service"

FILES:${PN} += "${systemd_unitdir}/system/testc.service"

S = "${WORKDIR}"


do_install:append(){
    # Install systemd stuff
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/testc.service ${D}${systemd_unitdir}/system
}
#RDEPENDS:${PN} = "helloworld"
# Systemd class stuff