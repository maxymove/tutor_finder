<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <style>
        h2{
            color: #e55743;
        }
        form{
            text-align: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        legend{
            color: #e55743;
        }
        p{
            color: #e55743;
        }
        h1 {
            color: #e55743;
        }
        body {
            text-align: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: #fcf3ec;
        }
        .button {
            --offset: 10px;
            --border-size: 2px;
            display: block;
            position: relative;
            padding: 1.5em 3em;
            appearance: none;
            border: 0;
            background: transparent;
            color: #e55743;
            text-transform: uppercase;
            letter-spacing: 0.25em;
            outline: none;
            cursor: pointer;
            font-weight: bold;
            border-radius: 0;
            box-shadow: inset 0 0 0 var(--border-size) currentcolor;
            transition: background 0.8s ease;
        }
        .button:hover {
            background: rgba(100, 0, 0, .03);
        }
        .button__horizontal, .button__vertical {
            position: absolute;
            top: var(--horizontal-offset, 0);
            right: var(--vertical-offset, 0);
            bottom: var(--horizontal-offset, 0);
            left: var(--vertical-offset, 0);
            transition: transform 0.8s ease;
            will-change: transform;
        }
        .button__horizontal::before, .button__vertical::before {
            content: '';
            position: absolute;
            border: inherit;
        }
        .button__horizontal {
            --vertical-offset: calc(var(--offset) * -1);
            border-top: var(--border-size) solid currentcolor;
            border-bottom: var(--border-size) solid currentcolor;
        }
        .button__horizontal::before {
            top: calc(var(--vertical-offset) - var(--border-size));
            bottom: calc(var(--vertical-offset) - var(--border-size));
            left: calc(var(--vertical-offset) * -1);
            right: calc(var(--vertical-offset) * -1);
        }
        .button:hover .button__horizontal {
            transform: scaleX(0);
        }
        .button__vertical {
            --horizontal-offset: calc(var(--offset) * -1);
            border-left: var(--border-size) solid currentcolor;
            border-right: var(--border-size) solid currentcolor;
        }
        .button__vertical::before {
            top: calc(var(--horizontal-offset) * -1);
            bottom: calc(var(--horizontal-offset) * -1);
            left: calc(var(--horizontal-offset) - var(--border-size));
            right: calc(var(--horizontal-offset) - var(--border-size));
        }
        .button:hover .button__vertical {
            transform: scaleY(0);
        }
    </style>
</head>
<body style="background-color:#fcf3ec;">
<img src="../Tutor_Finder_Logo.png" alt="Tutor Finder"/>
<br>
<h1>LOGIN</h1>
<form action="/login" method="post">
    <fieldset>
        <legend><b>Enter your details</b></legend>
        <p>
            <label><b>Username</b></label>
            <input type = "text"
                   name="username"/>

        </p>
        <p>
            <label><b>Password</b></label>
            <input type = "password"
                   name="password"/>

        </p>
    </fieldset>
    <br>
    <br>
    <button type="submit" class="button" onclick="document.location.href='/login';">
        Sign in
        <div class="button__horizontal"></div>
        <div class="button__vertical"></div>
    </button>
<br>
<br>
<button type="button" class="button" onclick="document.location.href='/register';">
    First time here? Sign up
    <div class="button__horizontal"></div>
    <div class="button__vertical"></div>
</button>

<h2>
    ${error}
</h2>

</form>
</body>
</html>