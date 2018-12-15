package com.antonkom.reportoro

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DayController(private val repository: ArticleRepository) {

    @GetMapping("/")
    fun day(model: Model): ResponseEntity<Iterable<Article>> {
        val article = repository.findAllByOrderByAddedAtDesc()
        return ResponseEntity.ok().body(article)
    }
}