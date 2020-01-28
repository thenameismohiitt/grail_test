package book

class Student {
   Integer id
    String name
    String department
    String address
    Integer phone
    static constraints = {
     id(blank:false,unique:true)
     name(blank:false)
     department(blank:false)
     address(blank:false)
    }
}

