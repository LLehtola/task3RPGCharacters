# task3RPGCharacters
A foundation for a simple RPG game

The program has been structured as follows:

heroes package contains:
- Hero class which is used for creating Hero objects and it includes attributes for Hero objects and methods for creating Hero objects, displaying their contents, increasing hero XP and incrementing the level of the hero
- a sub-package classes which includes classes describing the behaviour of Hero objects (sub-package follows strategy and factory patterns)

items package contains:
- Item class which is used for creating Item objects and it includes attributes for Item objects and methods for creating Item objects and displaying their contents
- a sub-package classes which includes classes describing the behaviour of Item objects (sub-package follows strategy and factory patterns)

Main class outside packages runs a simple example where a couple of Hero objects are instantiated and the displayed (including changing level of one Hero object),
as well as one Item object is instantiated and displayed

LIMITATIONS OF THE PROGRAM:

- I did not manage to complete all the Item features, namely the calculation of armor bonuses for each character attribute and the applicable weapon attack damages
- My approach for the Item classes was probably too complicated and this made my program readily harder to expand
