# 5 - Review development tools

We want to review day to day tools that we use:
  ###Git
 - **What is it and how does it work?**

      Git is the most commonly used version control system. Git tracks the changes you make to files, so you have a 
      record of what has been done, and you can revert to specific versions should you ever need to. Git also makes 
      collaboration easier, allowing changes by multiple people to all be merged into one source.
    
 - **What are the basic operations?**
     - `git pull`
        
       The git pull command is used to fetch and download content from a remote repository and immediately update the
       local repository to match that content. Any time you start working on a project, you should get the most recent
       changes to your local copy.

       Git pull is a combination of 2 different commands:

         - `fetch`
         - `merge`
            
     - `git checkout`

       The git checkout command lets you navigate between the branches created by `git branch`. Checking out a branch 
       updates the files in the working directory to match the version stored in that branch, and it tells Git to 
       record all new commits on that branch. Think of it as a way to select which line of development you’re working on.

     - `git status`

       The git status command displays the state of the working directory and the staging area. It lets you see which
       changes have been staged, which haven’t, and which files aren’t being tracked by Git.

     - `git commit`

       A Git commit is like a snapshot of your project at a specific point in time. When you make a commit, Git saves
       the state of your project, including all tracked files, and assigns a unique identifier (a commit hash) to this
       snapshot. Each commit is uniquely identified by a SHA-1 hash, ensuring its integrity and uniqueness.
       This allows you to:

         - **Track Changes:** Keep a record of what changes were made, who made them, and when.
         - **Collaborate:** Work seamlessly with other developers without overwriting each other’s work.
         - **Revert Changes:** Roll back to previous versions if something goes wrong.

       When we commit, we should **always** include a **message**. By adding clear messages to each commit, it is easy
       for yourself (and others) to see what has changed and when.

     - `git add`

       The git add command adds a change in the working directory to the staging area. It tells Git that you want to
       include updates to a particular file in the next commit. However, git add doesn't really affect the repository
       in any significant way—changes are not actually recorded until you run git commit.

     - `git push`

       The git push command is used to upload local repository content to a remote repository. Pushing is how you
       transfer commits from your local repository to a remote repo.

     - More advanced commands:
         - `git revert`

           The git revert command is a forward-moving undo operation that offers a safe method of undoing changes.
           Instead of deleting or orphaning commits in the commit history, a revert will create a new commit that inverses
           the changes specified. Git revert is a safer alternative to git reset in regards to losing work.

         - `git force push`

           The git force push command is typically used in scenarios where you need to update the commit history on a 
           remote repository to match your local repository, even if it means discarding changes that are on the remote 
           but not in your local repository. Whenever you run the git push command, Git has a look at your local repository
           and copies to the remote side whatever is missing. This includes commits, trees, blobs, and tags (the last of 
           which are not pushed by default). After copying the missing content, Git attempts to overwrite the current 
           main with the latest commit. This overwrite is allowed if the change is a “fast forward”, that is, if the old
           main commit is an ancestor of the new main commit.
           Git force push is rarely the best approach to the problem.

           There are 2 big reasons for this:

             1. There’s a high chance you overwrite commits from your colleagues, resulting in lost work;
             2. There’s a high chance your colleagues will be developing their work based on the old commit history.
  
     - **Creating PRs and merging to main**
       - Type of merges?
         - **Regular merge** - `git merge` is used to combine two branches.
    
           Here are the steps to perform a merge:
    
           1. Confirm the receiving branch - if needed you can use got checkout to switch to the correct branch.
           2. Fetch the latest remote commits - make sure your branch is up to date with the latest remote commits.
            Once the fetch is completed ensure the `main` branch has the latest updates by executing `git pull.`
           3. Merging

         **Resolving conflict** - If the two branches you're trying to merge both changed the same part of the same file,
         Git won't be able to figure out which version to use. When such a situation occurs, it stops right before the merge
         commit so that you can resolve the conflicts manually. When you encounter a merge conflict, running the `git status`
         command shows you which files need to be resolved.

       - **Squash merge** - `git merge --squash` is a Git operation that allows you to take all the changes from one branch
         and squash them into a single commit on top of the branch you're currently on. This is different from a regular merge,
         where all commits from the feature branch are preserved. By squashing them into one, you're essentially saying, "Take
         all these changes as if they happened in a single moment."
          - Why use git merge squash?
             - To maintain a clean and linear project history.
             - Reverting changes is straightforward because all the changes from the feature branch are condensed into a single commit.
             - when changes are packed into a single commit, it makes the code review process much easier.
             - Here are the steps to perform a squash merge:

                1. **Checkout to the Base Branch**: Make sure you are on the branch you want to merge into. **`git checkout main`**.

                2. **Perform the Squash Merge**: Use the **`git merge --squash`** command followed by the feature branch name.
                   **`git merge --squash feature-branch`**

                3. **Commit the Changes**: Finally, commit the changes. **`git commit -m "Squashed commit from feature-branch"`**
          
 ##GUI
  Using a git UI - Git GUIs are applications that provide a visual representation of a variety of Git functions, simplifying the 
  process of version control for those who prefer a graphical interface over a command-line interface (CLI). 
  **Sourcetree** is a free graphical user interface (GUI) desktop client that simplifies how you interact with Git
  repositories so that you can fully concentrate on coding.

  ### **Types of Git GUIs**

   - **Desktop Applications**: Standalone applications like GitHub Desktop, SourceTree, and Tower.
   - **IDE Integrations**: Built-in tools within IDEs like Visual Studio Code, IntelliJ IDEA, and Eclipse.
   - **Web-Based Interfaces**: Online platforms such as GitHub, GitLab, and Bitbucket.

   ### **Benefits of Git GUIs**

   - **Ease of Use**: Simplifies complex Git commands into point-and-click actions.
   - **Visual Representation**: Offers visual diff tools, commit history graphs, and branch management.
   - **Integration**: Combines code editing and version control in one place, especially within IDEs.
     
  

     
##Bash
Review basics of bash scripting - what is bash?
A Bash script is a plain text file which contains a series of commands. These commands are a mixture of commands we
would normally type ourselves on the command line (such as **ls** or **cp** for example) and commands we
could type on the command line but generally wouldn't

Anything you can run normally on the command line can be put into a script and it will do exactly the same thing. 
Similarly, anything you can put into a script can also be run normally on the command line and it will do exactly the 
same thing. It is convention to give files that are Bash scripts an extension of **.sh** (myscript.sh for example).


	 ```
     { 1. #!/bin/bash
       2. # A sample Bash script, by Manal
       3. echo Hello World!
     }
     ```
- **Line 1** - Is what's referred to as the **shebang**.
- **Line 2** - This is a comment. Anything after **#** is not executed. It is for our reference only.
- **Line 3** - Is the command echo which will print a message to the screen. You can type this command yourself on the 
               command line and it will behave exactly the same.