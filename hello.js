class Rectangle {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
    area(){
        return this.height * this.width;
    }
    perimeter(){
        return 2 * (this.height + this.width);
    }
    
}

const r = new Rectangle(5, 5);
console.log(r.area());
console.log(r.perimeter());

function fakeFetch(callback) {
    setTimeout(
        function x() {
            d = "hello";
            callback(d);
        }, 5000
    )
}

function display(x) {
    console.log(x);
}

function d() {
    display(100);
}

fakeFetch(display);
d();