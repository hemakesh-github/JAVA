let x = {
    a: 1,
    b: 2,
    sum() {
        return this.a + this.b
    },
    Sub() {
        return this.a - this.b;
    }
};

console.log(x.sum());
console.log(x.Sub());


function outer(){
    x = 10;
    function inner(z){
        return z;
    }
    return inner;
}

y = outer();
console.log(y(20));