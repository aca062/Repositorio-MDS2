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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); justify-content: space-between;" id="layoutCabecera">
  <vaadin-button id="logo">
    logo 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end;" float="" margin-right="200px" id="layoutBotones" margin="">
   <vaadin-button id="verPerfil">
     Ver perfil 
   </vaadin-button>
   <vaadin-button id="cerrarSesion">
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
  <vaadin-vertical-layout theme="spacing" id="layoutContenido" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout id="layoutContacto" style="width: 100%; align-self: center; align-items: baseline; justify-content: center;background-color: var(--lumo-contrast-10pct);" class="footer">
   <vaadin-vertical-layout theme="spacing" id="layoutTitulo" style="width: 20%; justify-content: center; align-items: baseline; flex-grow: 1; flex-shrink: 0;">
    <h3 id="h3" style="align-self: center;">Contacto</h3>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="layoutInformacion" style="width: 80%;">
    <h4 id="h4Telefono">+34 914257860</h4>
    <h4 id="h41Correo">Heading 4</h4>
   </vaadin-vertical-layout>
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
