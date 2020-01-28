package book

class Topic {
    static hasMany = [forum:Forum]
    static belongsTo = Forum
    static constraints = {
    }
}
