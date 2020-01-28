package book

class Forum {
    static hasMany = [topic:Topic]
    static mapping = {topic joinTable: false, column: 'forum_id'}
    static constraints = {
    }
}
