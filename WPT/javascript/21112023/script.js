function Person(name, age, mobile)={
    this.name = name;
    this.age = age;
    this.mobile = mobile;

    this.setName = function(name){
        this.name = name;
    }
    this.getName = function(){
        return this.name;
    }
}
p1 = new Person("Lion", 23, "24972935927359");
p2 = new Person("Tiger", 35, "253295927");

console.log(p1);
console.log(p2);

let person={
    name: "shashank",
    age: 21,
    mobile:'123456798765',

    getName:function(){
        return this.name;},

    setName:function(name){
        this.name = name;},
    setMobile:function(mobile){
        this.mobile = mobile;
    },
    getMobile:function(){
        return this.mobile;},

}
console.log(persson.age);
console.log(persson.getName());
console.log(person.getMobile());
