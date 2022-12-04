//
//  KakaoMapView.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/23.
//

import SwiftUI
import NMapsMap
import CoreLocation

struct NaverMapView: View {
    
    let locationFetcher = LocationFetcher()
    
    init(){
        self.locationFetcher.requestAuthorisation()
        
    }
    
    var body: some View {
        ZStack{
            UIMapView()
                .edgesIgnoringSafeArea(.all)
        }
        
    }
}


struct UIMapView: UIViewRepresentable {
    func makeUIView(context: Context) -> NMFNaverMapView {
        let view = NMFNaverMapView()
        view.showZoomControls = true
        view.mapView.positionMode = .direction
        view.mapView.zoomLevel = 17
        view.showZoomControls = true
        view.showLocationButton = true
        view.mapView.mapType = .hybrid
        return view
    }
    
    func updateUIView(_ uiView: NMFNaverMapView, context: Context) {}
}

struct NaverMapView_Previews: PreviewProvider {
    static var previews: some View {
        NaverMapView()
    }
}
