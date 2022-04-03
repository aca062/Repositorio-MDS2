import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion';

@customElement('vista-lista_de_reproduccion_favoritos')
export class VistaLista_de_reproduccion_favoritos extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout">
  <h1 id="h1">Lista de favoritos</h1>
  <vaadin-select value="Opciones" style="align-self: center;" id="vaadinSelect">
   <template>
    <vaadin-list-box selected="0" id="vaadinListBox">
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
 <h3 id="h3">Paco12</h3>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end;" id="vaadinHorizontalLayout1">
   <h2 style="margin-right: var(--lumo-space-xl);" id="h2">3/1000</h2>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout2">
   <vista-cancion id="vistaCancion" style="width: 100%;"></vista-cancion>
   <vista-cancion id="vistaCancion1" style="width: 100%;"></vista-cancion>
   <vista-cancion id="vistaCancion2" style="width: 100%;"></vista-cancion>
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
