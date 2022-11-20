//
//  InfoView.swift
//  PersonalCard
//
//  Created by Sam.Lee on 2022/11/16.
//

import SwiftUI

struct InfoView: View {
    
    let text: String
    let imageName: String
    
    var body: some View {
        Capsule()
            .foregroundColor(.white)
            .frame(height: 40)
            .overlay(
                HStack{
                    Image(systemName: imageName)
                        .foregroundColor(.green)
                    Text(text)
                        .font(.system(size: 15))
                        .foregroundColor(.black)
                }
            )
            .padding(.all)
    }
}


struct InfoView_Previews: PreviewProvider {
    static var previews: some View {
        InfoView(text: "+82 010-4201-0538", imageName: "phone.fill")
            .previewLayout(.sizeThatFits)
        
    }
}
