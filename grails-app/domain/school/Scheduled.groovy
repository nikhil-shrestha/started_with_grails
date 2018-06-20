package school

class Scheduled {

    String name
    Subject subject
    Period period
    static belongsTo = [teacher:Teacher]
    static mapping = {
        teacher lazy: false
        subject lazy: false
        period lazy: false
    }
}
