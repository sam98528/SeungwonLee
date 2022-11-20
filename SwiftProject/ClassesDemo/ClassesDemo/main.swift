
   
var skelton1 = Enemy(health: 100, attackStrength: 10)
var skelton2 = skelton1

skelton1.takeDamage(10)
skelton2.takeDamage(20)

print(skelton1.health)
print(skelton2.health)
