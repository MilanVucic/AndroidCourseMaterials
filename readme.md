
# READ ME
This project will help you with learning and homework.   
You should download it from git and open locally to practice between classes.   
I'll probably modify it as the course progresses, so make sure to always pull the latest version.
## How to use
Once you have opened your project locally, try to navigate to the file that you want to inspect,  
learn from or just copy a piece of code to your own project.  
I'll try to name files according to the lessons they appear in (in some logical manner).  
For example, the `XML` files used in lesson 2, will have a prefix `lesson_2_`, while Java files used in lesson 4 are all under `lesson_4` package.
>PRO TIP: Use `shift+shift` shortcut to quickly search for a file by name.
## Useful Shortcuts
This is a list of shortcuts I personally like to use in IntelliJ products, refer to the link below for a comprehensive list. They work across all of their platforms. The shortcuts I use are for Windows, so sorry Mac users, but I have a solution for you. Use the first shortcut that searches for actions and learn Mac equivalents for them or just visit [this link to find your shortcut](https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html).
#### General
- `CTRL+SHIFT+A` Search actions - basically searches all the other shortcuts that you forget. Example of what you can search: `rename`, `generate`, `pull`, `git`, `build`, `build apk` and so on. Endless possibilities. Single most powerful shortcut.
- `ALT+ENTER` Quick Actions. Very useful and widely used shortcut. When you have an error or a warning in the code, usually Android studio will have several ideas on how to help you fix it. Depending on the context, these actions will differ, so explore them as you need.
- `CTRL+F` Search in file - normal search that exists almost in any program you ever open. From Chrome, to Word, any app has this.
- `CTRL+SHIFT+F` Powerful search with many additional options (across whole project, or certain folders or files). Explore options as you need. Supports RegEx search too.
- `CTRL+R` Find and Replace. Self-explanatory, you can replace one match at a time or all at once.
- `CTRL+SHIFT+R` Powerful version of the Find and Replace.
- `CTRL+Z`, `CTRL_SHIFT+Z` Undo & Redo. Keep in mind that you can undo and redo almost any action, not just text typing, but file creation, deletion, renaming, extracting a resource etc.

#### Navigation
- `SHIFT+SHIFT`Search for files. Used quite often to quickly navigate. As any search in IntelliJ products, it's "smart". This means that if you're looking for a file named "MyBookCollection" you can just type "MBC" or "MyBoColl" or something similar and it'll still find it. You don't have to finish long words so you can get really fast at this.
- `Holding CTRL and clicking with the mouse` Everything becomes clickable while holding `CTRL`. Clicking on variable/method/class usage in code will take you to their respective declaration, while clicking on the declaration will give you a list of their usages across all files. This is very useful when learning a new project in a firm. There are likely to be many files which you don't know the names of, how they work or how they're correlated with each other. In an example:
  `MovieRepository movieRepository = new HardCodedMovieRepository();  
  movieRepository.getMovieGenres();`  
  You could click on any word other than `new` and get a different result. Try it!
- `CTRL+TAB` Cycles between tabs similar to how `ALT+TAB` cycles between windows.  Holding `CTRL` while continuing to tap `TAB` moves you forward, while holding `SHIFT` takes you backwards.

> Pro tip: Works in other apps that have tabs such as browsers.

- `CTRL+E` Opens recently Edited files.
- `CTRL+G` Go to line. Particularly useful if you have a large file and your app crashes on a certain line.

#### Editor
Keep in mind that some of these are general shortcuts in any text editor.
- `CTRL+A`, `CTRL+C`, `CTRL+V` Select All, Copy, Paste. The holy grail of text editing. Everybody knows them, but programmers sure love to use them.
- `CTRL+SHIFT+V` Paste from History. You no longer have to paste the last thing you copied or cut, you can choose from a list.
- `CTRL+X` Cut.
- `Holding down shift` Combine with arrows to select text in that direction. Generally a useful shortcut for almost any text editor ever.
- `Holding down ctrl` Combine with arrows to jump over whole words rather than letters at a time when clicking an arrow.
- `PRO TIP` Holding down both `CTRL` and `SHIFT` at the same time allow you to select whole words much faster.
- `CTRL+D` Duplicate. Instantly duplicates a line your cursor is in. Useful when repeating a few lines for mocking data or adding fields in a new class etc. Selecting a block of code duplicates the whole block rather than a single line.
- `CTRL+/`Comments out the line your cursor is in. Selecting a block comments out a whole block
- `CTRL+ALT+L`Format file. Fixes little irregularities in your files like missing a space before or after `=`, `,`fixes improper indentation, removes unused imports etc.
- `CTRL+W` Close current tab. THIS is not a default shortcut. I don't know the default one. The point is that you can customize any shortcut and I opted for `CTRL+W` because that closes the tab in Chrome. Go to Settings, find "Keymap", find the shortcuts that you want to customize and do so :)
- `Holding down CTRL+SHIFT or ALT+SHIFT` and then using `up`or `down` arrows to rearrange lines. If a block is selected, it rearranges the whole block. There's a subtle difference between the two but they're quite similar. Explore :)
- `TAB`/`SHIFT+TAB` Indent/Un-indent selected line or block
- `CTRL+P` Parameter info. Shows the parameters of a method closest to your cursor.
#### Generate
- `ALT+INSERT` (very useful for two things):
    - When used in editor - Allows you to quickly create Constructor, Getters, Setters, Override Methods, Implements Methods and other useful actions.
    - When used on the project pane - Creates a new File. Depending on what folder you have selected, you may get different options (i.e. Java file in `src`, resource files in `xml` folders etc).
  >Pro tip: These actions are searchable so you can do `ALT+INSERT` , then type 'gs' and click Getters and Setters.
- `CTRL+O`/`CTRL+I` Override/Implement methods. Lets you pick methods to override/implement from its superclasses.
#### Refactor
- `SHIFT+F6`Rename. Works on files, variables, classes, methods, almost anything that can be renamed. Usually works in XML as well. Very important to use this when renaming because it also renames all the references to that method, class, variable, or even an ID in the XML.
>Pay attention: You may have to also hold Fn key depending on your F-keys setup on a laptop. This is the case for me.
- `CTRL+ALT+C` Extract to constant. Creates a constant out of a selected block (usually a single value). This is useful for keeping your code clean as you don't want to have random numbers scattered around the code, but rather some constants.
- `CTRL+ALT+V` Extract to variable. Creates a variable out of a selected block.
- `CTRL+ALT+P` Extract to parameter. Creates a parameter out of a selected block.
- `CTRL+ALT+M` Extract to method. Creates a method out of a selected block, useful for refactoring.
#### Run & Debug
>Keep in mind that you might have to use `Fn` key depending on your F-keys setup.
- `SHIFT+F10` Run
- `SHIFT+F9` Run in Debug mode. When in debug, these apply
    - `F9` Resume. Moves to next breakpoint.
    - There are others like Step Over, Step Into, etc. But I personally just click this by mouse
- `ALT+F8` Evaluate expression. Very useful when debugging to examine certain expressions or parts of expressions.
- `Holding ALT` when stopped on a breakpoint allows you to click on expressions to evaluate them.
#### Git
- `CTRL+K` Commit
- `CTRL+SHIFT+K` Push
- `CTRL+T` Pull
- `CTRL+ALT+Z` Revert changes (Rollback)
- `CTRL+ALT+A` Add file to Git
- `CTRL+SHIFT+~` Change branch

## Your ideas?
This project is in its infancy. In fact, the you're the first group to have it.   
So I'm open to hearing your thoughts on it and ideas on how to improve it for everybody.   
I'll keep on trying to make it more informative.