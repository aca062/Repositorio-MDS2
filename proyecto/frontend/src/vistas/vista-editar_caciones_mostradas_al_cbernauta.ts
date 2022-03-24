import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-editar_caciones_mostradas_al_cbernauta')
export class VistaEditar_caciones_mostradas_al_cbernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: var(--lumo-space-xl);">Editar canciones mostradas al cibernauta</h2>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="margin-left: var(--lumo-space-xl); width: 100%;background-color: var(--lumo-contrast-10pct);">
  <vaadin-select value="Item one" id="vaadinSelect" style="width: 80%;" placeholder="Buscar canciones">
   <template>
    <vaadin-list-box id="vaadinListBox1" selected="0">
     <vaadin-item id="vaadinItem4" selected>
      Lista de canciones
     </vaadin-item>
     <vaadin-item id="vaadinItem5">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem6">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-list-box id="vaadinListBox" style="align-self: flex-start; width: 80%;">
   <vaadin-item id="vaadinItem">
    Whising Well
   </vaadin-item>
   <vaadin-item id="vaadinItem1">
    Plan A
   </vaadin-item>
   <vaadin-item id="vaadinItem2">
    Lifes a Mess
   </vaadin-item>
   <vaadin-item id="vaadinItem3">
    Still Lost
   </vaadin-item>
  </vaadin-list-box>
  <vaadin-horizontal-layout theme="spacing-l" id="vaadinHorizontalLayout" style="align-self: flex-end; margin-right: 10%;">
   <vaadin-button id="vaadinButton">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="vaadinButton1">
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
