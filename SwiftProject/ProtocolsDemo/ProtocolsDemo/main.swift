
protocol CanFly {
    func fly()
    
}


class Bird {
    
    var isFemale = true
    
    func layEgg(){
        if isFemale{
            print("Bird lay Eggs")
        }
    }
    

    
}

class Eagle : Bird, CanFly {
    
    func soar(){
        print("The eagles soar")
    }
    
    func fly(){
        print("Bird Fly")
    }
    
}


class Penguin : Bird {
    
    func swim(){
        print("Penguin Swims")
    }
}

struct FlyingMuseum {
    func flyingDemo (flyingObject : CanFly){
        flyingObject.fly()
    }
}

struct Airplane : CanFly{
    func fly(){
        print("airplane Fly")
    }
}

let myEagle = Eagle()
let myPenguin = Penguin()
let myAirplane = Airplane()

let museum = FlyingMuseum()
museum.flyingDemo(flyingObject: myEagle)
museum.flyingDemo(flyingObject: myAirplane)

