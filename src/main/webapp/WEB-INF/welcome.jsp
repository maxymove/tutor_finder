<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

    <style>

        h1{
            color: #e55743;
        }

        body {
            text-align : center;
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
            letter-spacing: .25em;
            outline: none;
            cursor: pointer;
            font-weight: bold;
            border-radius: 0;
            box-shadow: inset 0 0 0 var(--border-size) currentcolor;
            transition: background .8s ease;

        &:hover {
             background: rgba(100, 0, 0, .03);
         }

        &__horizontal,
        &__vertical {
             position: absolute;
             top: var(--horizontal-offset, 0);
             right: var(--vertical-offset, 0);
             bottom: var(--horizontal-offset, 0);
             left: var(--vertical-offset, 0);
             transition: transform .8s ease;
             will-change: transform;

        &::before {
             content: '';
             position: absolute;
             border: inherit;
         }
        }

        &__horizontal {
             --vertical-offset: calc(var(--offset) * -1);
             border-top: var(--border-size) solid currentcolor;
             border-bottom: var(--border-size) solid currentcolor;

        &::before {
             top: calc(var(--vertical-offset) - var(--border-size));
             bottom: calc(var(--vertical-offset) - var(--border-size));
             left: calc(var(--vertical-offset) * -1);
             right: calc(var(--vertical-offset) * -1);
         }
        }

        &:hover &__horizontal {
                     transform: scaleX(0);
                 }

        &__vertical {
             --horizontal-offset: calc(var(--offset) * -1);
             border-left: var(--border-size) solid currentcolor;
             border-right: var(--border-size) solid currentcolor;

        &::before {
             top: calc(var(--horizontal-offset) * -1);
             bottom: calc(var(--horizontal-offset) * -1);
             left: calc(var(--horizontal-offset) - var(--border-size));
             right: calc(var(--horizontal-offset) - var(--border-size));
         }
        }

        &:hover &__vertical {
                     transform: scaleY(0);
                 }

        }
    </style>
</head>
<body>
<%--<form th:action = "/login"  method="post">--%>
<%--    <div class="button__horizontal"></div>--%>
<%--    <div class="button__vertical"></div>--%>
<%--    --%>
<%--        <input type="button" value="Continue to schedule" class="button" />--%>


<%--</form>--%>

<h1>Welcome to Tutor Finder</h1>
<button type="button" class="button" onclick="document.location.href='/login';"/>
    Student
    <div class="button__horizontal"></div>
    <div class="button__vertical"></div>
</button>
<button class="button">
    Teacher
        <div class="button__horizontal"></div>
        <div class="button__vertical"></div>
</button>
<button type="button" class="button" onclick="document.location.href='/register';"/>
    Reister
        <div class="button__horizontal"></div>
        <div class="button__vertical"></div>
</button>

</body>
</html>                                                                                                                          </html>