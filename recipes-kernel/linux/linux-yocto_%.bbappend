FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://defconfig"


KCONFIG_MODE = "alldefconfig"

