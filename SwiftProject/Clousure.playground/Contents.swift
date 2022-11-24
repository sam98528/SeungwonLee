import UIKit

let myName : String = {
    return "Sam"
}()


let myRealName : (String) -> String = {(name) in
    return name
}


let myRealName2 : (String) -> String = {
    print($0)
  return $0
}

print(myName)


print(myRealName2("Sam Lee"))
