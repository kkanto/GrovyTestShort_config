 
listView('GrovyTestShort Jobs') {
    description('GrovyTestShort Jobs')
    jobs {
        regex('GrovyTestShort_.+')
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
