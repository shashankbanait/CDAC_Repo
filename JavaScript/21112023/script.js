let persson={
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