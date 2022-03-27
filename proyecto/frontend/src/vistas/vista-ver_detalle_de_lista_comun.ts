import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_de_canciones';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-ver_detalle_de_lista_comun')
export class VistaVer_detalle_de_lista_comun extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-l);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <h2 id="h2">Lista de reproducción nº 21</h2>
  <vaadin-select value="Opciones" style="align-self: center;" id="vaadinSelect">
   <template>
    <vaadin-list-box id="vaadinListBox" selected="0">
     <vaadin-item selected id="vaadinItem">
       Opciones 
     </vaadin-item>
     <vaadin-item id="vaadinItem1">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem2">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
 </vaadin-horizontal-layout>
 <vaadin-button id="vaadinButton">
   Paco12 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout style="align-self: flex-end; margin-right: 10%;" id="vaadinHorizontalLayout1">
   <h2 id="h21">4/1000</h2>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout2">
   <vista-lista_de_canciones style="width: 100%;" id="vistaLista_de_canciones"></vista-lista_de_canciones>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
