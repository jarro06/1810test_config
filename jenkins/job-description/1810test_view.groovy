 
listView('1810test Jobs') {
    description('1810test Jobs')
    jobs {
        regex('1810test_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
