<%@ include file="../../../cabecalho.jsp" %>
<div class="span9" id="content">
                      <!-- morris stacked chart -->
                    <div class="cadastro">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Cadastro Estabelecimento</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                     <form class="form-horizontal"  method="POST">
                                      <fieldset>
                                        <legend>Dados do Estabelecimento</legend>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Cnpj:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.cnpj">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Nome:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.nome">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Bairro:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.bairro">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Cidade:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.cidade">
                                          </div>
                                        </div>                                 
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Rua:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.rua">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Complemento:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.complemento">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Email:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.email">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Usuario:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="number" name="id">
                                          </div>
                                        </div>
                                        <div class="form-actions">
                                          <button type="submit" id="confirm_button" class="btn btn-primary">Salvar</button>
                                          <button type="reset" class="btn">Cancel</button>
                                        </div> 
                                      </fieldset>
                                    </form>

                                </div>
                            </div>
                        </div>
                       
                    </div>                     
                    <ul id="list">
