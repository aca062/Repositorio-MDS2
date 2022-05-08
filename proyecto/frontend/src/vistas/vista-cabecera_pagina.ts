import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cabecera_pagina')
export class VistaCabecera_pagina extends LitElement {
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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);" id="layoutCabecera">
  <vaadin-button id="logo" style="margin: var(--lumo-space-l);">
   Logo
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing-l" style="justify-content: flex-end; width: 100%;" float="" margin-right="200px" id="layoutBotones" margin="">
   <vaadin-button id="verPerfil" style="margin: var(--lumo-space-l);">
     Ver perfil 
   </vaadin-button>
   <vaadin-button id="cerrarSesion" style="margin-right: var(--lumo-space-m); margin: var(--lumo-space-l);">
     Cerrar sesión 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; justify-content: space-between;" id="layoutPrincipal1">
  <vaadin-horizontal-layout theme="spacing" id="layoutBuscador" style="width: 100%; align-self: center; justify-content: center;">
   <vaadin-text-field placeholder="Search" id="buscador" style="width: 50%;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
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
