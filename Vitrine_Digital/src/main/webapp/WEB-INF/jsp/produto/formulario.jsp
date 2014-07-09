<%@ include file="../../../header.jsp" %>
<div class="span9" id="content">
                      <!-- morris stacked chart -->
                    <div class="cadastro">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Cadastro Produto</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                     <form class="form-horizontal"  method="POST">
                                      <fieldset>
                                        <legend>Dados do Produto</legend>
                                        
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Nome:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.nome">
                                          </div>
                                        </div>                                        
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Preço:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.cidade">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="textarea2">Descrição</label>
                                          <div class="controls">
                                            <textarea class="input-xlarge textarea" style="width: 410px; height: 100px"></textarea>
                                          </div>
                                        </div>                                 
                                        
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Categoria:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="estabelecimento.bairro">
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
