package school

class Teacher {
    String name
    static hasMany = [units:Scheduled]

    static constraints = {
        units nullable: false
    }
}
