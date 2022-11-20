
struct Enemy{
    
    var health : Int
    var attackStrength : Int
    
    init(health: Int, attackStrength: Int) {
        self.health = health
        self.attackStrength = attackStrength
    }
    
    mutating func takeDamage(_ amount : Int){
        health = health - amount
    }
    
    func move(){
        print("Walk Forward")
    }
    
    func attack(){
        print("Enemy Attacked : \(attackStrength) damage")
    }
    
    
    
}
