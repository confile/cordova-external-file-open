cordova-external-file-open
==========================

Sorry for writing here, since there is no issue list active: 

This plugin does not work with iOS 8. Here is the error I get when I try to use it: 

2015-01-17 19:50:21.177 Buddy.is[2781:435401] THREAD WARNING: ['ExternalFileUtil'] took '209.496826' ms. Plugin should use a background thread.
2015-01-17 19:50:21.228 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x1702959f0 H:[UIView:0x17019aea0(402)]>",
    "<NSLayoutConstraint:0x1702955e0 _UIAlertControllerView:0x13469d5a0.width >= UIView:0x17019aea0.width>",
    "<NSLayoutConstraint:0x174295360 _UIAlertControllerView:0x13469d5a0.width == UIView:0x17419e780.width>",
    "<NSLayoutConstraint:0x174295e50 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17419e780(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x1702959f0 H:[UIView:0x17019aea0(402)]>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.229 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x1702950e0 UILabel:0x13469e080.width == UIView:0x17019ba00.width - 32>",
    "<NSLayoutConstraint:0x170294c30 UIView:0x17019ba00.width == UIView:0x17019aea0.width>",
    "<NSLayoutConstraint:0x1702955e0 _UIAlertControllerView:0x13469d5a0.width >= UIView:0x17019aea0.width>",
    "<NSLayoutConstraint:0x174295360 _UIAlertControllerView:0x13469d5a0.width == UIView:0x17419e780.width>",
    "<NSLayoutConstraint:0x174295e50 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17419e780(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x1702950e0 UILabel:0x13469e080.width == UIView:0x17019ba00.width - 32>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.231 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x1702951d0 UILabel:0x13469e1e0.width == UIView:0x17019ba00.width - 32>",
    "<NSLayoutConstraint:0x170294c30 UIView:0x17019ba00.width == UIView:0x17019aea0.width>",
    "<NSLayoutConstraint:0x1702955e0 _UIAlertControllerView:0x13469d5a0.width >= UIView:0x17019aea0.width>",
    "<NSLayoutConstraint:0x174295360 _UIAlertControllerView:0x13469d5a0.width == UIView:0x17419e780.width>",
    "<NSLayoutConstraint:0x174295e50 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17419e780(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x1702951d0 UILabel:0x13469e1e0.width == UIView:0x17019ba00.width - 32>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.233 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x170294eb0 V:[UIView:0x17019ba00(>=44)]>",
    "<NSLayoutConstraint:0x170294c80 UIView:0x17019ba00.height == UIView:0x17019aea0.height>",
    "<NSLayoutConstraint:0x170295630 _UIAlertControllerView:0x13469d5a0.height == UIView:0x17019aea0.height>",
    "<NSLayoutConstraint:0x1742953b0 _UIAlertControllerView:0x13469d5a0.height == UIView:0x17419e780.height>",
    "<NSLayoutConstraint:0x174295ea0 'UIView-Encapsulated-Layout-Height' V:[UIView:0x17419e780(13)]>"
)


Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x170294eb0 V:[UIView:0x17019ba00(>=44)]>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.234 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x170295040 V:[UIView:0x17019a000(>=44)]>",
    "<NSLayoutConstraint:0x170294f00 V:|-(0)-[UIView:0x17019a000]   (Names: '|':UIView:0x17019ba00 )>",
    "<NSLayoutConstraint:0x170294fa0 V:[UICollectionView:0x1348e0400]-(0)-|   (Names: '|':UIView:0x17019a000 )>",
    "<NSLayoutConstraint:0x170294c80 UIView:0x17019ba00.height == UIView:0x17019aea0.height>",
    "<NSLayoutConstraint:0x170295630 _UIAlertControllerView:0x13469d5a0.height == UIView:0x17019aea0.height>",
    "<NSLayoutConstraint:0x1742953b0 _UIAlertControllerView:0x13469d5a0.height == UIView:0x17419e780.height>",
    "<NSLayoutConstraint:0x174295630 UIView:0x17019ba00.bottom == UICollectionView:0x1348e0400.bottom>",
    "<NSLayoutConstraint:0x174295ea0 'UIView-Encapsulated-Layout-Height' V:[UIView:0x17419e780(13)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x170295040 V:[UIView:0x17019a000(>=44)]>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.257 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x174291620 H:[SFAirDropIconView:0x1701fd400(76)]>",
    "<NSLayoutConstraint:0x174291440 H:|-(0)-[SFAirDropIconView:0x1701fd400](LTR)   (Names: '|':UIView:0x17019a4e0 )>",
    "<NSLayoutConstraint:0x1742912b0 H:[SFAirDropIconView:0x1701fd400]-(15)-[UILabel:0x1345b66f0'AirDrop. Um Dateien \U00fcber ...'](LTR)>",
    "<NSLayoutConstraint:0x1742911c0 UILabel:0x1345b66f0'AirDrop. Um Dateien \U00fcber ...'.right == UIView:0x17019a4e0.right - 12>",
    "<NSLayoutConstraint:0x170298ab0 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17019a4e0(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x174291620 H:[SFAirDropIconView:0x1701fd400(76)]>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.258 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x170293c90 H:[SFAirDropActiveIconView:0x1345b6960(76)]>",
    "<NSLayoutConstraint:0x170293e20 H:|-(0)-[SFAirDropActiveIconView:0x1345b6960](LTR)   (Names: '|':UIView:0x17019a4e0 )>",
    "<NSLayoutConstraint:0x170293f60 H:[SFAirDropActiveIconView:0x1345b6960]-(15)-[UILabel:0x134697920'AirDrop. Inhalte f\U00fcr Pers...'](LTR)>",
    "<NSLayoutConstraint:0x170293fb0 UILabel:0x134697920'AirDrop. Inhalte f\U00fcr Pers...'.right == UIView:0x17019a4e0.right + 5>",
    "<NSLayoutConstraint:0x170298ab0 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17019a4e0(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x170293c90 H:[SFAirDropActiveIconView:0x1345b6960(76)]>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.260 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x174291440 H:|-(0)-[SFAirDropIconView:0x1701fd400](LTR)   (Names: '|':UIView:0x17019a4e0 )>",
    "<NSLayoutConstraint:0x1742912b0 H:[SFAirDropIconView:0x1701fd400]-(15)-[UILabel:0x1345b66f0'AirDrop. Um Dateien \U00fcber ...'](LTR)>",
    "<NSLayoutConstraint:0x1742911c0 UILabel:0x1345b66f0'AirDrop. Um Dateien \U00fcber ...'.right == UIView:0x17019a4e0.right - 12>",
    "<NSLayoutConstraint:0x170298ab0 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17019a4e0(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x1742912b0 H:[SFAirDropIconView:0x1701fd400]-(15)-[UILabel:0x1345b66f0'AirDrop. Um Dateien über ...'](LTR)>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.262 Buddy.is[2781:435401] Unable to simultaneously satisfy constraints.
	Probably at least one of the constraints in the following list is one you don't want. Try this: (1) look at each constraint and try to figure out which you don't expect; (2) find the code that added the unwanted constraint or constraints and fix it. (Note: If you're seeing NSAutoresizingMaskLayoutConstraints that you don't understand, refer to the documentation for the UIView property translatesAutoresizingMaskIntoConstraints) 
(
    "<NSLayoutConstraint:0x170293e20 H:|-(0)-[SFAirDropActiveIconView:0x1345b6960](LTR)   (Names: '|':UIView:0x17019a4e0 )>",
    "<NSLayoutConstraint:0x170293f60 H:[SFAirDropActiveIconView:0x1345b6960]-(15)-[UILabel:0x134697920'AirDrop. Inhalte f\U00fcr Pers...'](LTR)>",
    "<NSLayoutConstraint:0x170293fb0 UILabel:0x134697920'AirDrop. Inhalte f\U00fcr Pers...'.right == UIView:0x17019a4e0.right + 5>",
    "<NSLayoutConstraint:0x170298ab0 'UIView-Encapsulated-Layout-Width' H:[UIView:0x17019a4e0(0)]>"
)

Will attempt to recover by breaking constraint 
<NSLayoutConstraint:0x170293f60 H:[SFAirDropActiveIconView:0x1345b6960]-(15)-[UILabel:0x134697920'AirDrop. Inhalte für Pers...'](LTR)>

Make a symbolic breakpoint at UIViewAlertForUnsatisfiableConstraints to catch this in the debugger.
The methods in the UIConstraintBasedLayoutDebugging category on UIView listed in <UIKit/UIView.h> may also be helpful.
2015-01-17 19:50:21.265 Buddy.is[2781:435401] the behavior of the UICollectionViewFlowLayout is not defined because:
2015-01-17 19:50:21.265 Buddy.is[2781:435401] the item height must be less than the height of the UICollectionView minus the section insets top and bottom values.
