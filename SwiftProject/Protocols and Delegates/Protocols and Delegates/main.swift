
protocol AdvancedLifeSupprot{
    func performCPR()
}


class EmergencyCallHandler{
    var delegate : AdvancedLifeSupprot?
    
    func assessSituation(){
        print("Can you tell me what Happend")
    }
    
    func medicalEmergency(){
        delegate?.performCPR()
    }
}

struct Paramedic: AdvancedLifeSupprot{
    
    init(handler : EmergencyCallHandler){
        handler.delegate = self
    }
    
    func performCPR() {
        print("The paramedic does chest compressions")
    }
}

class Doctor : AdvancedLifeSupprot{
    init (handler: EmergencyCallHandler){
        handler.delegate = self
    }
    func performCPR() {
        print("The doctor does Chest Compressions")
    }
    
    func useStathescope(){
        print("Doctor use tatescope")
    }
}

class Surgeon : Doctor{
    override func performCPR() {
        super.performCPR()
        print("The Surgeon does ches Compressions")
    }
    
    func useElecticDrill(){
        print("Whirr...")
    }
}
let emilio = EmergencyCallHandler()
let angela = Surgeon(handler: emilio)
//let pete = Paramedic(handler: emilio)

emilio.assessSituation()
emilio.medicalEmergency()

