def app = {
    def date
    def age
}

app.date = new Date()
app.age = 54
app {
    name = "Test${44}"
}

