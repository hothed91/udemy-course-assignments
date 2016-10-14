function Greeter(){
    this.greeting = 'hello world!!!';
    this.greet = function() {
        console.log(this.greeting);
    }
}

module.exports = Greeter;
