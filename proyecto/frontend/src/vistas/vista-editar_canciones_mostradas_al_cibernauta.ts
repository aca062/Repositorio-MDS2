import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-editar_canciones_mostradas_al_cibernauta')
export class VistaEditar_canciones_mostradas_al_cibernauta extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: var(--lumo-space-xl);">Editar canciones mostradas al cibernauta</h2>
 <vaadin-vertical-layout id="layoutCanciones" style="margin-left: var(--lumo-space-xl); width: 90%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <vaadin-select value="Item one" id="buscador" style="width: 80%;" placeholder="Buscar canciones"></vaadin-select>
  <vaadin-list-box id="listaCanciones" style="align-self: flex-start; width: 80%;">
   <vaadin-horizontal-layout style="justify-content: space-between; width: 70%;" id="layoutCancion">
    <vaadin-item id="nombreCancion">
      Still Lost 
    </vaadin-item>
    <vaadin-button id="eliminar">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="justify-content: space-between; width: 70%;" id="layoutCancion1">
    <vaadin-item id="nombreCancion1">
      Lifes a Mess 
    </vaadin-item>
    <vaadin-button id="eliminar1">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="justify-content: space-between; width: 70%;" id="layoutCancion2">
    <vaadin-item id="nombreCancion2">
      Plan A 
    </vaadin-item>
    <vaadin-button id="eliminar2">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-list-box>
  <vaadin-horizontal-layout theme="spacing-l" id="layoutBotones" style="align-self: flex-end; margin-right: 10%;">
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
