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
    @IBOutlet weak var resultLable: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        resultLable.text = "Loading..."
        let r = GitHubApi()
        r.load { user -> KotlinUnit in
            self.UI{
                self.resultLable.text = "result : \(user.url)"
            }
            return KotlinUnit()
        }
    }
    func UI(_ block: @escaping ()->Void) {
        DispatchQueue.main.async(execute: block)
    }
}
