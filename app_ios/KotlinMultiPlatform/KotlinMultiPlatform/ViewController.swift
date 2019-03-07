//
//  ViewController.swift
//  KotlinMultiPlatform
//
//  Created by Denys Meloshyn on 07/03/2019.
//  Copyright © 2019 Denys Meloshyn. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        let helloWorld = HelloWorld()
        print(helloWorld.greetings())
    }


}

