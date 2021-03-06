<!-- Modal -->
<div class="modal bs-modal-sm" id="myModal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <br>
            <div class="bs-example bs-example-tabs">
                <ul id="myTab" class="nav nav-tabs">
                    <li class="active sigin-popup"><a href="#signin" data-toggle="tab">Sign In</a></li>
                    <li class=""><a href="#signup" data-toggle="tab">Register</a></li>
                    <li class=""><a href="#why" data-toggle="tab">Why?</a></li>
                </ul>
            </div>
            <div class="modal-body">
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in" id="why">
                        <p>We need this information so that you can receive access to the site and its content. Rest
                            assured your information will not be sold, traded, or given to anyone.</p>
                        <p></p><br> Please contact <a mailto:href="JoeSixPack@Sixpacksrus.com"></a>JoeSixPack@Sixpacksrus.com</a>
                        for any other inquiries.</p>
                    </div>
                    <div class="tab-pane fade active in" id="signin">
                        <form class="form-horizontal">
                            <fieldset>
                                <!-- Sign In Form -->
                                <!-- Text input-->
                                <div class="control-group">
                                    <label class="control-label" for="userid">Alias:</label>
                                    <div class="controls">
                                        <input required="" id="userid" name="userid" type="text" class="form-control"
                                               placeholder="JoeSixpack" class="input-medium" required="">
                                    </div>
                                </div>

                                <!-- Password input-->
                                <div class="control-group">
                                    <label class="control-label" for="passwordinput">Password:</label>
                                    <div class="controls">
                                        <input required="" id="passwordinput" name="passwordinput" class="form-control"
                                               type="password" placeholder="********" class="input-medium">
                                    </div>
                                </div>

                                <!-- Multiple Checkboxes (inline) -->
                                <div class="control-group">
                                    <label class="control-label" for="rememberme"></label>
                                    <input type="checkbox" name="rememberme" id="rememberme" value="Remember me">
                                    Remember me
                                </div>

                                <!-- Button -->
                                <div class="control-group">
                                    <label class="control-label" for="signin"></label>
                                    <div class="controls">
                                        <button id="signin" name="signin" class="btn btn-success">Sign In</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="signup">
                        <form class="form-horizontal">
                            <fieldset>
                                <!-- Sign Up Form -->
                                <!-- Text input-->
                                <div class="control-group">
                                    <label class="control-label" for="Email">Email:</label>
                                    <div class="controls">
                                        <input id="Email" name="Email" class="form-control" type="text"
                                               placeholder="JoeSixpack@sixpacksrus.com" class="input-large" required="">
                                    </div>
                                </div>

                                <!-- Text input-->
                                <div class="control-group">
                                    <label class="control-label" for="userid">Alias:</label>
                                    <div class="controls">
                                        <input id="userid" name="userid" class="form-control" type="text"
                                               placeholder="JoeSixpack" class="input-large" required="">
                                    </div>
                                </div>

                                <!-- Password input-->
                                <div class="control-group">
                                    <label class="control-label" for="password">Password:</label>
                                    <div class="controls">
                                        <input id="password" name="password" class="form-control" type="password"
                                               placeholder="********" class="input-large" required="">
                                        <em>1-8 Characters</em>
                                    </div>
                                </div>

                                <!-- Text input-->
                                <div class="control-group">
                                    <label class="control-label" for="reenterpassword">Re-Enter Password:</label>
                                    <div class="controls">
                                        <input id="reenterpassword" class="form-control" name="reenterpassword"
                                               type="password" placeholder="********" class="input-large" required="">
                                    </div>
                                </div>

                                <!-- Multiple Radios (inline) -->
                                <div class="control-group">
                                    <label class="control-label">Humanity Check:</label>
                                    <div class="control">
                                        <input type="radio" name="humancheck" id="humancheck-0" value="robot"
                                               checked="checked">
                                        <label class="control-label" for="humancheck-0">
                                            I'm a Robot</label>
                                    </div>

                                    <div class="control">

                                        <input type="radio" name="humancheck" id="humancheck-1" value="human">
                                        <label class="control-label" for="humancheck-1">
                                            I'm Human</label>
                                    </div>

                                </div>

                                <!-- Button -->
                                <div class="control-group">
                                    <label class="control-label" for="confirmsignup"></label>
                                    <div class="controls">
                                        <button id="confirmsignup" name="confirmsignup" class="btn btn-success">Sign
                                            Up
                                        </button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <center>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </center>
            </div>
        </div>
    </div>

</div>
<%--https://bootsnipp.com/snippets/8y25--%>