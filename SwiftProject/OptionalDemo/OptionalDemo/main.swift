
let myOptional: String?

myOptional = "Sam"

// 1. Force Unrapp

let text1: String = myOptional!


// 2. Check for nil value

if myOptional != nil{
    let text2 : String = myOptional!
}else{
    print("NIL")
}


// 3. Optional Binding (2번이랑 사실 똑같음)

if let safeOptional = myOptional{
    let text3 :String = safeOptional
}else{
    print("NIL")
}


// 4. Nil Colaescing Operator

let text4: String = myOptional ?? "Default"


// 5. Optional Chaining

struct MyOptional {
    
    var property = 123
    
    func method(){
        print("I am Struct's Method.")
    }
}

let myOptionalStruct : MyOptional?
myOptionalStruct = nil
print(myOptionalStruct?.property)
