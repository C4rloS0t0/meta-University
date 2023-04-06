SUMMARY = "Systemd example recipe"
DESCRIPTION = "Systemd service example for test C service"
LICENSE = "CLOSED"

inherit systemd
NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "testcpp.service"

SRC_URI += "file://testcpp.service"

FILES:${PN} += "${systemd_unitdir}/system/testcpp.service"

S = "${WORKDIR}"


do_install:append(){
    # Install systemd stuff
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/testcpp.service ${D}${systemd_unitdir}/system
}
#RDEPENDS:${PN} = "helloworld"
# Systemd class stuff