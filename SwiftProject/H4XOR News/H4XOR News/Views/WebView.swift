//
//  WebView.swift
//  H4XOR News
//
//  Created by Sam.Lee on 2022/12/05.
//

import SwiftUI
import WebKit


struct WebView : UIViewRepresentable {
    
    let urlString : String?
    
    func makeUIView(context: Context) -> some UIView {
        let webview = WKWebView()
        if let safeString = urlString {
            if let url = URL(string: safeString){
                let request = URLRequest(url: url)
                webview.load(request)
            }
        }
        return webview
    }
    
    func updateUIView(_ uiView: UIViewType, context: Context) {
        
    }
    
    
}
