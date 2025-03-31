package main

import (
	"log"
	"net/http"
)

func main() {
	// Serve static files from the static directory
	fs := http.FileServer(http.Dir("static"))
	http.Handle("/static/", http.StripPrefix("/static/", fs))

	// Serve HTML files from the html directory
	http.Handle("/", http.FileServer(http.Dir("html")))

	// Start the server
	log.Println("Server started at http://localhost:8080")
	log.Fatal(http.ListenAndServe(":8080", nil))
}