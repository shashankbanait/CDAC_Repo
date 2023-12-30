const printDetails = (person)=>
{
    person.forEach(person=> {
        console.log(`${person.name} ${person.age} ${person.mobile}`)
    });
}
module.exports = {
    printDetails
}