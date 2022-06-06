import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

@customElement('vista-editar_cancion')
export class VistaEditar_cancion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <h2 id="h2Titulo" style="margin-left: var(--lumo-space-xl);">Editar cancion</h2>
 <vaadin-vertical-layout style="width: 90%; margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="layoutCancion">
  <vaadin-text-field label="Título" id="título" value="120" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-text-field label="Título álbum" value="El último tour del mundo" id="títuloÁlbum" has-value style="width: 60%;"></vaadin-text-field>
  <vaadin-text-field label="Compositores" value="Tainy" id="compositores" has-value style="width: 60%;"></vaadin-text-field>
  <vaadin-text-field label="Productores" id="productores" value="Tainy" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-text-field label="Interpretes" id="interpretes" value="Bad bunny" style="width: 60%;" has-value></vaadin-text-field>
  <h5 style="margin-bottom: 0; margin-top: 10px;">Estilo</h5>
  <vaadin-combo-box id="estilo"></vaadin-combo-box>
  <vaadin-horizontal-layout style="width: 100%; align-self: flex-start; justify-content: flex-start; align-items: center;" id="layoutFichero">
   <h4 id="h4Titulo" style="align-self: center;">Fichero multimedia</h4>
   <vaadin-button id="anadirCancion" style="margin-left: 1%;">
     Añadir 
   </vaadin-button>
   <h5 id="h5Requisitos" style="flex-grow: 0; margin-left: 10%;">Solo son válidos los .mp3, .mp4, .ogg</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="layoutBotones" style="align-self: flex-end; justify-content: space-evenly; width: 25%;">
   <vaadin-button id="cancelar">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="confirmar">
     Confirmar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
