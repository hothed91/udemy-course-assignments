# Lesson 0: Installing Typescript on PC
* tsc < fileName.ts > - compiles typescript file into javascript
* node < fileName > - runs file
* params -> paramName : Type
* TypeScript can't be translated by browsers, which is why its compiled into a javascript.

# Lesson 1: Basic Syntax and Structure
## Variables
* the types are: *var*, *let*, and *const*
  - const, is a variable type for Constants
  - let, is simular to var but it has a key difference that sets the two apart. And that difference is Block-scoping.
    + Block-scoping variables that are not visible outside of their nearest containing block or for-loop.
      - Due to block-scoping you can not redeclare a variable with the same scope.
      - You also can't read or write to a variable before it has been declared.
      - *Important Note*: you can still capture a block-scoped variable defore it's declared. The only catch is that it is illegal to call that function before the declaration.
        * If targeting ES2015, a modern runtime will throw an error; however, right now (1/29/2017) Typescript is permissive and won't report this as an error.
    + Using let instead of var prevents variables from leaking out of their scope.
* to declare variables in TS you simply type in whatever the type of variable and the variable name i.e.
  - var fullName : string = "John Doe";
  - let paidAccount: boolean = true;
  - const versionNumber : number = 1.3;