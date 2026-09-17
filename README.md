
* Features

- Menu-driven console interface (Register / Login / Exit)
- Username validation (must contain an underscore, max five characters)
- Password complexity validation (length, capital letter, number, special character)
- Cell phone number validation using a regular expression
- Login that re-prompts on incorrect credentials instead of returning to the menu
- Personalised welcome message on successful login

# Using the program

On launch you are shown a menu:

```
===== MENU =====
1. Register
2. Login
3. Exit
```

**Option 1 — Register**
Prompts for a username, password, cell phone number, first name, and last name.
If any field fails validation, an explanatory message is shown and you are returned
to the menu to try again.

**Option 2 — Login**
Prompts for the username and password. If they don't match the registered details,
it re-prompts immediately. Type `exit` as the username to return to the menu.
You must register before logging in.

**Option 3 — Exit**
Ends the program.


## Validation rules

### Username
- Must contain an underscore (`_`)
- Must be no more than five characters long

Valid example: `kyl_1`

### Password
- At least eight characters long
- Contains at least one capital letter
- Contains at least one number
- Contains at least one special character

Valid example: `Ch&&sec@ke99!`

### Cell phone number
- Must begin with an international country code (`+`, e.g. `+27`)
- Must be no more than ten characters long
- Validated with the regular expression `^\+\d+$`


Known limitations

- Only one user can be registered per run of the program. Details are stored in
  memory and are lost when the program exits.
- The cell phone length rule (ten characters maximum, including the `+`) follows the
  assignment brief literally. A full South African international number such as
  `+27821234567` is twelve characters and will therefore be rejected. Confirm the
  intended rule before final submission.

