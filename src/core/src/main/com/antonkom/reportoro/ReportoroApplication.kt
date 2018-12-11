package com.antonkom.reportoro

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReportoroApplication

fun main(args: Array<String>) {
    runApplication<ReportoroApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
